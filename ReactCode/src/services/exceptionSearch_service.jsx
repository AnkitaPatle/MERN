class ExceptionSearchService{

    getAllAuditChapter(chapter){
        //console.log(search);
        
        let promise = fetch("http://localhost:8090/getAllAuditChapter", {
                                method:"GET",
                                headers:{
                                    "content-type":"application/json"
                                },
                                body:JSON.stringify(chapter)
                            });
        return promise;
    }

    getAllAuditDriverNameByAuditChapter(driver){

        let promise = fetch("http://localhost:8090/getAllAuditDriverNameByAuditChapter/{chapterName}", {
                                method:"GET",
                                headers:{
                                    "content-type":"application/json"
                                },
                                body:JSON.stringify(driver)
                            });
        return promise;
    }

    getAllAuditElementNameByAuditDriver(element){
        let promise = fetch("http://localhost:8090/getAllAuditElementNameByAuditDriver/{driverName}", {
            method:"GET",
            headers:{
                "content-type":"application/json"
            },
            body:JSON.stringify(element)
        });
return promise;
    }

}

export default ExceptionSearchService;