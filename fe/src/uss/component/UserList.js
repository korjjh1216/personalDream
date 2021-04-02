import axios from "axios"
import React, { useState, useEffect} from "react"
import { Link } from "react-router-dom"

const UserList = () => {
    const [List, setList] = useState([])
    const fetchList = () => {
        axios
            .get("http://localhost:8080/user/list")
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
            <h1 align="center">회원 목록</h1>
            
            <table border="1" align="center">
                <thead>
                    <tr>
                        <th align="center" width="80">유저 고유 번호 </th>
                        <th align="center" width="320">유저 id</th>
                        <th align="center" width="100">비밀번호</th>
                        <th align="center" width="180">이    름</th>
                        <th align="center" width="180">이 메 일</th>
                        <th align="center" width="180">생년월일</th>
                        <th align="center" width="180">성    별</th>
                        <th align="center" width="180">핸드폰번호</th>
                        <th align="center" width="180">등록일자</th>

                    </tr>
                </thead>
                {List.map((user)=> [
                <tbody>
                        <tr key={user.userNo}>
                        <th align="center" width="80">{user.userNo}</th>
                        <th align="center" width="320">{user.username}</th>
                        <th align="center" width="100">{user.password}</th>
                        <th align="center" width="180">{user.name}</th>
                        <th align="center" width="180">{user.email}</th>
                        <th align="center" width="180">{user.birthday}</th>
                        <th align="center" width="180">{user.gender}</th>
                        <th align="center" width="180">{user.phoneNumber}</th>
                        <th align="center" width="180">{user.regDate}</th>
                        </tr>  
                </tbody>])}
            </table>
           
        </div>
        <Link to = {`/`}><button>홈으로</button></Link>
    </form>
    )
    
}
export default UserList