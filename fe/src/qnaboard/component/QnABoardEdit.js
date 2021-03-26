import React from 'react'
const ArticleEdit = () => (
    <form>
        <div className="container" align="center">
            <h3>게시글을 언제든지 수정하세요
            </h3>
​
            <table>
                <tr>
                    <td>번호</td>
​
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
                <button type="submit">수정</button>
            </table>
        </div>
    </form>
);
export default ArticleEdit