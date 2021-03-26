import React from 'react'
import {Route} from 'react-router-dom'
import Home from './cmm/container/Home'
import List from './qnaboard/container/List'
import Create from  './qnaboard/container/Create'

const App = () => {
    return(<>
    <Route path="/" component={ Home } exact/>
     <Route path = "/List" component={List} QnABoardList/>
     <Route path = "/Create" component={Create} QnABoardAdd/>
    
    </>)
}

export default App
