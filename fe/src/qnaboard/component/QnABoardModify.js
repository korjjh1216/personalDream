import React, { useState } from 'react';
import axios from 'axios'
import { Link } from "react-router-dom";

const QnABoardModify = (props) => {
    const [inputs, setInputs] = useState({
        title: "",
        content: "",
    });

const { title, content} = inputs;

const handleChange = (e) => {
    const { value, name } = e.target;
        setInputs({
            ...inputs,
            [name]: value,
        });
};

const Edit = (e) =>{
    e.preventDefault();
    axios
        .put(`http://localhost:8080/qna/modify/${props.match.params.Id}`,{
            boardNo: props.match.params.Id,
            title,
            content})
        .then(res=>{
                console.log(res)
                alert('게시글 수정이 완료되었습니다.')
                props.history.push(`/List`)
        })
        .catch((err)=>{
                console.log(err)
        })
}

 return(
    <form align= "center">
            <h3>게시글을 수정하세요</h3>
​           <table>
                제   목 :  <input type="text" onChange={handleChange} name="title" value={title}/><br/><br/>
                본   문 :  <textarea row = "5" onChange={handleChange} name="content" value={content}/><br/>
                <button onClick={Edit}>수정하기</button>
            </table>
    </form>
    )

};
export default QnABoardModify