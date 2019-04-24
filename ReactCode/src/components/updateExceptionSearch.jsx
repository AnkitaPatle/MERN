import React, { Component } from "react";

class UpdateExceptionSearch extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }

  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-md-3" />
          <div className="col-md-12 role-border">
            <form>

              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="ce" className="complianceExceptionLabel">CE#: </label> &nbsp;&nbsp;
                  <span>CE 11 AH</span>
                  {/* <input type="text" name="ce" id="ce" /> */}
                </div>

                <div className="col-sm-6 form-group">
                  <label htmlFor="status" className="complianceExceptionLabel">Status: </label> &nbsp;&nbsp;
                  <select name="auditcomponent" className= "complianceExceptionOption">
                    <option >Open</option>
                  </select>
                </div>
              </div>

              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="createdate" className="complianceExceptionLabel">Create Date: </label> &nbsp;&nbsp;
                  <span>04/19/2019</span>
                </div>

                <div className="col-sm-6 form-group">
                  <label htmlFor="identifieddate" className="complianceExceptionLabel">Identified Date: </label> &nbsp;&nbsp;
                  <input type="date" name="identifieddate" id="identifieddate" />
                </div>
              </div>

              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="createdate" className="complianceExceptionLabel">Current Owner: </label> &nbsp;&nbsp;
                  <span>BeaconAdmin Admin</span>
                </div>

                <div className="col-sm-6 form-group">
                  <label htmlFor="estidentifieddate" className="complianceExceptionLabel"> Est. Completion Date: </label>
                  <input type="date" name="estidentifieddate" id="estidentifieddate" />
                </div>
              </div>

              <div className="col-sm-12 form-group">
                  <label htmlFor="estidentifieddate" className="complianceExceptionHeading">Exception Description: </label>
                 <p>If the Organization receives notification of LEP Reset due to new Low Income status, does the organization take the appropriate action?
                    As amended with the MARx System Redesign, Plans will not submit RESET or UNDO transactions when NUNCMO changes due to</p>                
                </div>

                
                <div className="complianceExceptionDetailsPanel">
                <div className="complianceExceptionDetailsColumn">
                <div>
                    <lable className="complianceExceptionLabel">Component:</lable>
                    <span>Late Enrollment Penalty</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Driver:</lable>
                    <span>LEP Changes and Notices</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Element:</lable>
                    <span>Changes Due to LIS Eligibility</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Audit Type:</lable>
                    <span>Adhoc</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Sub type:</lable>
                    <span>CMS initiated</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Condition:</lable>
                    <span>02-003#01</span>
                </div>

                <div>
                    <lable className="complianceExceptionLabel">Parent Link:</lable>
                    <span>-</span>
                </div>
                </div>
                </div>
               
                <div className="col-sm-6 form-group">
                  <label htmlFor="status" className="complianceExceptionLabel"> Root Cause Type: </label> &nbsp;&nbsp;
                  <select name="auditcomponent" className= "complianceExceptionOption">
                    <option > Select Root Cause Type:</option>
                  </select>
                </div>

                <div className="col-sm-12 form-group">
                  <label htmlFor="status" className="complianceExceptionLabel"> Root Cause Type: </label> &nbsp;&nbsp;
                  <textarea className="exceptionTextArea" maxLength="10000" rows="7"></textarea>
                </div>             

              <input type="submit" value="Update" className="btn btn-success" />
            </form>
          </div>
        </div>
      </div>
    );
  }
}

export default UpdateExceptionSearch;
