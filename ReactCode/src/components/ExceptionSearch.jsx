import React, { Component } from "react";
import ExceptionSearchService from "../services/exceptionSearch_service.jsx"

class ExceptionSearch extends Component {
  constructor(props){
    super(props);
    this.state = {
      auditcomponent: [],
      auditdriver: [],
      auditelement: [],
      selectedValue:""
    }


    this.serv = new ExceptionSearchService();
  }

  handleChange=(event)=> {
    this.setState({selectedValue: event.target.value});
  }
  
  // onSelectElementbyChapter(e){
  //   this.serv.getAllAuditDriverNameByAuditChapter()
  //     .then((response) => {
  //       return response.json()
  //     })
  //     .then(data => {
  //       let auditdriverApi = data.map(driver => {return {value: driver, display: driver} });
  //       this.setState({ auditdriver: [{value: '', display: 'All'}].concat(auditdriverApi) });
  //       console.log(auditdriverApi);
  //     })
  //     .catch(error => {
  //       console.log(`Error Status ${error}`);
  //     });    

  // }

  // onSelectDriverbyDriver(e){
  //   this.serv.getAllAuditElementNameByAuditDriver()
  //     .then((response) => {
  //       return response.json()
  //     })
  //     .then(data => {
  //       let auditelementApi = data.map(element => {return {value: element, display: element} });
  //       this.setState({ auditelement: [{value: '', display: 'All'}].concat(auditelementApi) });
  //       console.log(auditelementApi);
  //     })
  //     .catch(error => {
  //       console.log(`Error Status ${error}`);
  //     });    

  // }

  componentDidMount() {    
      this.serv.getAllAuditChapter()
      .then((response) => {
        return response.json()
      })
      .then(data => {
        let auditcomponentApi = data.map(component => {return {value: component, display: component} });
        this.setState({ auditcomponent: [{value: '', display: 'All'}].concat(auditcomponentApi) });
        //console.log(auditcomponentApi);
      })
      .catch(error => {
        console.log(`Error Status ${error}`);
      });    
  }

 

  render() {  
    console.log("selectedValue: "+this.state.selectedValue);

    return (
      <div className="container">
        <div className="row">
          <div className="col-md-3" />
          <div className="col-md-6 role-border">
            <form>
              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="auditcomponent">Audit Component</label>
                  <br />
                  <select className="form-control" name="auditcomponent" value={this.state.selectedValue} onChange={this.handleChange}>                    
                    {this.state.auditcomponent.map((component) => <option key={component.value} value={component.value}>{component.display}</option>)}
                  </select>
                </div>
                <div className="col-sm-6 form-group">
                  <label htmlFor="ce">CE#</label>
                  <br />
                  <input
                    type="text"
                    name="ce"
                    id="ce"
                    className="form-control"
                    placeholder="CE#"
                  />
                </div>
              </div>

              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="auditdriver">Audit Driver</label>
                  <br />
                  <select className="form-control" name="auditdriver">
                  {this.state.auditdriver.map((driver) => <option key={driver.value} value={driver.value}>{driver.display}</option>)}
                  </select>
                </div>
                <div className="col-sm-6 form-group">
                  <label htmlFor="datefrom">Creation Date From</label>
                  <br />
                  <input type="date" className="form-control" name="datefrom" />
                </div>
              </div>

              <div className="row">
                <div className="col-sm-6 form-group">
                  <label htmlFor="auditelement">Audit Element</label>
                  <br />
                  <select className="form-control" name="auditelement" onChange={this.onSelectDriverbyDriver} value={this.state.value}>
                  {this.state.auditelement.map((element) => <option key={element.value} value={element.value}>{element.display}</option>)}
                  </select>
                </div>
                <div className="col-sm-6 form-group">
                  <label htmlFor="datethrough">Creation Date Through</label>
                  <br />
                  <input
                    type="date"
                    className="form-control"
                    name="datethrough"
                  />
                </div>
              </div>

              <input type="submit" value="Search" className="btn btn-success" />
            </form>
          </div>
        </div>
        <br />

        <div className="row roletable">
          <div className="col-md-2" />

          <div className="col-md-8 border-table">
            <table className="table table-bordered table-striped">
              <thead className="thead-dark">
                <tr>
                  <th>CE#</th>
                  <th>Audit Component</th>
                  <th>Audit Driver</th>
                  <th>Audit Element Exception</th>
                  <th>Audit Type</th>
                  <th>Current User</th>
                </tr>
              </thead>
              <tbody />
            </table>
          </div>
        </div>
      </div>
    );
  }
}



export default ExceptionSearch;
