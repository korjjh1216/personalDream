import React, { useState, useEffect} from "react"
import axios from 'axios'
import { Link } from "react-router-dom";

const QnABoardModify = (props) => {

const [read, setRead] = useState({})

const { title, content,userName} = read;

const fetchOne = () => {
    axios
        .get(`http://localhost:8080/qna/read/${props.match.params.Id}`)
        .then((res) => {
            console.log(res);
            setRead(res.data);
        })
        .catch((err) => console.log(err));
};

useEffect(() => {
    fetchOne();
},[]);

const Edit = (e) =>{
    e.preventDefault();
    axios
        .put(`http://localhost:8080/qna/modify/${props.match.params.Id}`,{
            boardNo: props.match.params.Id,
            title,
            content,
            userName})
        .then(res=>{
                console.log(res)
                alert('게시글 수정이 완료되었습니다.')
                props.history.push(`/List`)
        })
        .catch((err)=>{
                console.log(err)
        })
}

const handleChange = (e) => {
    const { value, name } = e.target;
        setRead({
            ...read,
            [name]: value,
        });
};

 return(
    <form align= "center">
            <h3>게시글을 수정하세요</h3>
​           <table>
                제   목 :  <input type="text" onChange={handleChange} name="title" value={read.title}/><br/><br/>
                본   문 :  <textarea row = "5" onChange={handleChange} name="content" value={read.content}/><br/>
                작 성 자:  <input type="text" name="userName" onChange={handleChange}   value={read.userName}readOnly/><br/><br/>
                <button type="post" onClick={Edit}>수정하기</button>
            </table>
    </form>
    )

};
export default QnABoardModify