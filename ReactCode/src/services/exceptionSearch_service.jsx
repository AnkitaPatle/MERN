class ExceptionSearchService{

    getAllAuditChapter(usr){
        //console.log(usr);
        
        let promise = fetch("localhost:8090/getAllAuditChapter", {
                                method:"GET",
                                headers:{
                                    "content-type":"application/json"
                                },
                                body:JSON.stringify(usr)
                            });
        return promise;
    }

}

export default ExceptionSearchService;