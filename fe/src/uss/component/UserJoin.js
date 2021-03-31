import React, { useState } from 'react';
import { Link } from "react-router-dom";
import axios from 'axios'

const UserJoin =(props) =>{
    const [inputs, setInputs] = useState({
                userName: "",
                password:"",
                name:"",
                email:"",
                birthday:"",
                gender:"",
                phoneNumber:""
            });

    const { userName, password, name,email,birthday,gender,phoneNumber} = inputs;

    const handleChange = (e) => {
        const { value, name } = e.target;
        setInputs({
            ...inputs,
            [name]: value,
        });
    };
    const handleSubmit = (e) => {
        e.preventDefault();
        axios
            .post("http://localhost:8080/user", {
                userName,
                password, 
                name,
                email,
                birthday,
                gender,
                phoneNumber
            })
            .then((res) => {
                console.log(res);
                props.history.push(`/UserList`)
            })
            .catch((err) => console.log(err));
    };    

    
        return(
        <form onSubmit={handleSubmit} method="post" align = "center">
                <h2> 회원 정보를 입력해주세요! </h2>
                유저 ID :  <input type="text" onChange={handleChange} name="userName" value={userName}/><br/><br/>
                비밀번호:  <input type="password" onChange={handleChange} name="password" value={password}/><br/><br/>
                이    름:  <input type="text" onChange={handleChange} name="name" value={name}/><br/><br/>
                이 메 일:  <input type="email" onChange={handleChange} name="email" value={email}/><br/><br/>
                생년월일:  <input type="text" onChange={handleChange} name="birthday" value={birthday}/><br/><br/>
                성    별:  <input type="text" onChange={handleChange} name="gender" value={gender}/><br/><br/>
                핸드폰번호:<input type="tel"  pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" onChange={handleChange} name="phoneNumber" value={phoneNumber}/><br/><br/>

                <button type="submit" align="center">등록하기</button>
            

        </form>
        )
  
};


export default UserJoin