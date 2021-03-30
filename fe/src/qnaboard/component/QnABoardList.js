import axios from "axios"
import React, { useState, useEffect} from "react"
import { Link } from "react-router-dom"

const QnABoardList = () => {
    const [List, setList] = useState([])
    const fetchList = () => {
        axios
            .get("http://localhost:8080/qna/list")
            .then((res) => {
                console.log(res)
                setList(res.data)
            })
            .catch((err) => console.log(err))
    }

    useEffect(() => {
        fetchList();
    }, []);    

    
    

    return  (
    <form>
        <div className="container" align="center">
            <h1 align="center">게시판 목록</h1>
            
            <table border="1" align="center">
                <thead>
                    <tr>
                        <th align="center" width="80">게시판 번호</th>
                        <th align="center" width="320">제목</th>
                        <th align="center" width="100">작성자</th>
                        <th align="center" width="180">등록일자</th>
                    </tr>
                </thead>
                {List.map((qna)=> [
                <tbody>
                        <tr key={qna.boardNo}>
                        <th align="center" width="80">{qna.boardNo}</th>
                        <th align="center" width="320">< Link to ={`/QnABoardRead/${qna.boardNo}`}>{qna.title}</ Link></th>
                        <th align="center" width="100">{qna.userName}</th>
                        <th align="center" width="180">{qna.regDate}</th>
                        </tr>  
                </tbody>])}
            </table>
           
        </div>
    </form>
    )
    
}
export default QnABoardList