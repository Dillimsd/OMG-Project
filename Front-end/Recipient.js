import React from 'react'
import './Recipient.css'
import './Payment.css'
import { useEffect,useState} from 'react';
import axios from 'axios';
import { json } from 'react-router-dom';
// import { useNavigate } from 'react-router-dom';
// import { useEffect } from 'react';
// import React from 'react-router-dom';










function Recipient()  {
    const [recp_name, setrecp_name] = useState('')
  
    const [recp_addr, setrecp_aadr] = useState('')

    const [recp_phone, setrecp_phone] = useState('')
    
    // const Recipi= () => {
    function handleSubmit(e){
            // e.preventDefault();
            console.log(e)
    
            axios.post("http://localhost:8080/addrecipient",{
                recp_name:e.recp_name,
                recp_addr:e.recp_addr,
                recp_phone:e.recp_phone
            })
              .then((response)=>{
                console.log(response.data)
                // alert('Succesfully update')
              } )
              .catch((err)=>{
                console.log(err)
                console.log(err.response)
              })
              }
            
        // }
    






    

    // const data = {Recp_name:"",Recp_address:"",Recp_Number:""};

    // const[inputData,setInputData] = useState(data)

    // const handleData =(e) =>{
    //     setInputData({...inputData,[e.target.name]:e.target.value})

    // }
    // const handleSubmit = (e) => {
    //     e.preventDefault();
    //     axios.post("http://localhost:8080/addrecipient", inputData)
    //     .then((response)=>{
    //         console.log(response)
    //     })
        


    // }

    // let navigate=useNavigate()

    

    // const [Recipient,setRecipient]=useState({
    //     Recp_name :"",
    //     Recp_address:"",
    //     Recp_number:""

    // });

    // const{Recp_name,Recp_address,Recp_number}=Recipient;

    // const {name,address,number} =Recipient;



    // const onInputChange= e =>{
    //     setRecipient({...Recipient, [e.target.Recp_name]: e.target.value});
    //     setRecipient({...Recipient,[address]: a.target.value});
    //     setRecipient({...Recipient,[number]: a.target.value});
    // };



    // const onSubmit = async e=> {
    //     e.preventDefault();
    //     await axios.post("http://localhost:8080/addRecipient",Recipient);
    //     alert('Data inserted')
    // //     // navigate("/")

    // };

    // action='/saverecipient'method='post'
  return (
    <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow flex-start'>
                <h2 className='text-center m-4'>Recipient Details</h2>
                <form >
                <div>
                    <label className='form-label'>
                        Recipient Name
                    </label>
                    <input type="text" className='form-control' placeholder='Enter Name' 
                    value={recp_name} 
                    onChange={(e)=> setrecp_name(e.target.value)} required
                    ></input>
                    
                </div>
                <div className='mb-3' >
                    <label  className='form-label'>
                        Recipient Address
                    </label>
                    <input 
                    id='address'
                    type="text"
                    className='form-control'
                    placeholder='Enter Address'
                   
                    value={recp_addr}
                    onChange={(e)=> setrecp_aadr(e.target.value)} required
                    ></input>
                    
                </div>
                <div className='mb-3'>
                    <label  className='form-label'>
                        Phone Number
                    </label>
                    <input 
                    id='number'
                    type="text"
                    className='form-control'
                    placeholder='Enter number'
                
                    value={recp_phone}
                    onChange={(e)=> setrecp_phone(e.target.value)} required
                    ></input>
                    
                </div>
                {/* <button  onClick={() => alert('Recipient updated successfull')} className='btn btn-outline-primary'>Submit</button> */}
                <button   className='btn btn-outline-primary' onClick={()=>{
                    let data={
                        recp_name:recp_name,
                        recp_addr:recp_addr,
                        recp_phone:recp_phone
                    }
                    handleSubmit(data)}}>Submit</button>
                </form>
            </div>
            {/* onClick={handleSubmit} */}
        </div>
    </div>
    
  )
}

export default Recipient
