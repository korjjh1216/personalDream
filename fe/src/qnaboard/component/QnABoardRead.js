import axios from "axios"
import React, { useState, useEffect} from "react"
import { Link } from "react-router-dom"

const QnABoardRead = (props) =>{
    const [read, setRead] = useState({})
    console.log(JSON.stringify(props))

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


    return  (
    <form>
        <div className="container">
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
            <button>수정하기</button>
            <button>삭제하기</button>
            <link to = {`/QnABoardList`}><button>목록으로</button></link>
        </div>
    </form>
    );
}
export default QnABoardRead
