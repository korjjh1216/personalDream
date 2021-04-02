import React, { useState,useEffect } from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";

const UserLogin = (props) =>{
    const [info,setinfo] = useState([])
    const{username,password}=info
    
    const fetchLogin =(e) => {
        e.preventDefault();
        axios
            .post("http://localhost:8080/user/login",{
                username,
                password
            })
            .then((res)=>{
                alert("로그인 되었습니다.")
                console.log(res)
                localStorage.setItem('token', JSON.stringify(res));
                props.history.push(`/`)
            })
            .catch((err) =>{
                alert("등록된 아이디가 없습니다. 회원가입을 하세요")
                 console.log(err)})
            
            
    }
    const handleChange = (e) => {
        const { value, name } = e.target;
        setinfo({
            ...info,
            [name]: value,
        });
    };

    return(
        <form>
            <table>
                <thead>로그인이 필요합니다.</thead>
                <tbody>

                    <tr>
                        <th>아이디</th>
                        <td><input type='text' placeholder='아이디를 입력해주세요' name = 'username' value={info.username} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <th>비밀번호</th>
                        <td><input type='password' placeholder='비밀번호를 입력해주세요' name = 'password' value={info.password} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type='button' onClick={fetchLogin} value='로그인'/>
                        </td>
                    </tr>
                    <Link to={'/'}><button>나가기</button></Link>
                        <button>
                         <Link to ={"/UserJoin"}>등록</Link>
                    </button>
                </tbody>
            </table>
        </form>
        )
}
 export default UserLogin