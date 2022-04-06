
node {

commitMessage = bat(returnStdout: true, script: 'git log -1 --oneline').trim()

//     stage ("Checkout") {
//         scmInfo = checkout scm
//         echo "scm : ${scmInfo}"
//         echo "${commit}"
//     }

    stage ("Condition"){
    echo "${commitMessage}"
    if(commitMessage.toLowerCase().contains("dev")){
        echo "PUFFFF"
     }
    else{
        echo "fuckoff"}
    }
}
