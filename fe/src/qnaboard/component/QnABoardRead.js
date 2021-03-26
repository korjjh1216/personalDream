import React from 'react'
const QnABoardRead = () =>(
    <form>
        <div className="container">
            <h1  align="center">게시글 보기</h1>
            <table align="center">
                <tr>
                    <td>번호</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>등록일자</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>제목</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>작성자</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>본문</td>
                    <td>
                        <textarea rows="5"></textarea>
                    </td>
                </tr>
            </table>
        </div>
    </form>
);

export default QnABoardRead
