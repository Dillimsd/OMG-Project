import React from "react";
// import './Payment.css'
import {
  MDBBtn,
  MDBCard,
  MDBCardBody,
  MDBCol,
  MDBContainer,
  MDBIcon,
  MDBInput,
  MDBRow,
} from "mdb-react-ui-kit";


// import 'mdb-react-ui-kit/dist/css/mdb.min.css';
// import "@fortawesome/fontawesome-free/css/all.min.css";

 

export default function Payment() {
  return (
    
    <MDBContainer fluid className="py-5 gradient-custom">
      <MDBRow className="d-flex justify-content-center py-5">
        <MDBCol md="7" lg="5" xl="4">
          <MDBCard style={{ borderRadius: "15px" }}>
            <MDBCardBody className="p-4">
              <MDBRow className="d-flex align-items-center">
                <MDBCol size="9">
                  <MDBInput
                    label="Card Number"
                    id="form1"
                    type="text"
                    placeholder="1234 5678 9012 3457"
                  />
                  
                  
                </MDBCol> 
                
                <MDBCol size="3">
                  
                
                  
                  <img
                    src="https://www.narendrasisodiya.com/Universal-UPI-QR-Code-Generator/upi-icon-black.png"
                    alt="visa"
                    width="64px" 
                  />
                </MDBCol>
                

                <MDBCol size="9">
                  <MDBInput
                    label="Cardholder's Name"
                    id="form2"
                    type="text"
                    placeholder="Cardholder's Name"
                  />
                </MDBCol> 
                

                <MDBCol size="6">
                  <MDBInput
                    label="Expiration"
                    id="form2"
                    type="text"
                    placeholder="MM/YYYY"
                  />
                </MDBCol>
                <MDBCol size="3">
                  <MDBInput
                    label="CVV"
                    id="form2"
                    type="text"
                    placeholder="&#9679;&#9679;&#9679;"
                  />
                </MDBCol>
                <MDBCol size="3">
                  <MDBBtn color="info" rounded size="lg">
                    <MDBIcon fas icon="arrow-right" />
                  </MDBBtn>
                </MDBCol>
              </MDBRow>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
  );
}