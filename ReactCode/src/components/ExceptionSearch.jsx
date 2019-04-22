import React, { Component } from "react";

class ExceptionSearch extends Component {
  constructor(props){
    super(props);
    this.state = {
      auditcomponent: [],
      auditelement: [],
      auditdriver: []
    }
  }
  


  render() {
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
                  <select className="form-control" name="auditcomponent">
                    <option>All</option>
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
                  <label htmlFor="auditelement">Audit Element</label>
                  <br />
                  <select className="form-control" name="auditelement">
                    <option>All</option>
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
                  <label htmlFor="auditdriver">Audit Driver</label>
                  <br />
                  <select className="form-control" name="auditdriver">
                    <option>All</option>
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
