import axios from "axios"
import React, { useState, useEffect} from "react"
import { Link } from "react-router-dom"
import List from "../container/List"

const QnABoardRead = (props) =>{
    const [read, setRead] = useState({})
    // console.log(JSON.stringify(props))

    const fetchOne = () => {
        axios
            .get(`http://localhost:8080/qna/read/${props.match.params.id}`)
            .then((res) => {
                console.log(res);
                setRead(res.data);
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchOne();
    },[]);

    const DEL = (e)=>{
        e.preventDefault();
        if(window.confirm('삭제하시겠습니까?'))
        {axios
            .delete(`http://localhost:8080/qna/delete/${props.match.params.id}`,{
                boardNo: props.match.params.Id,
            })
            .then(res =>{
                    console.log(res)
                    alert('삭제를 완료했습니다.')
                    props.history.push(`/List`)
            })
            .catch((err)=>{
                    console.log(err)
            })
        }
    }

    return  (
        <form>
        <div>
            <h1  align="center">게시글 보기</h1>
            <table align="center">
            <thead>
                    <tr>
                        <th>No</th>
                        <th>제목</th>
                        <th>내용</th>
                        <th>작성자</th>
                        <th>등록일자</th>
                    </tr>
            </thead>
            <tbody>
                    <tr>
                        <td>{read.boardNo}</td>
                        <td>{read.title}</td>
                        <td>{read.content}</td>
                        <td>{read.userName}</td>
                        <td>{read.regDate}</td>
                    </tr>
            </tbody>
            </table>
            <button>< Link to ={`/QnABoardModify/${read.boardNo}`}>수정하기</Link></button>
            <button onClick={DEL}>삭제하기</button>
            <Link to = {`/List`}><button>목록으로</button></Link>
        </div>
    </form>
    );
}
export default QnABoardRead
