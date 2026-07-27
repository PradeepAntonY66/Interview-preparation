const promise = new Promise((resolve, reject) => {
    let isLogged = true;

    if(isLogged){
        resolve("Login successfull");
    }else{
        reject("Login unsucessfull");
    }
});

promise.then(result => {
    console.log(result);
}).catch(error => {
    console.log("Error block")
})