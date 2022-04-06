
node {



//     stage ("Checkout") {
//         scmInfo = checkout scm
//         echo "scm : ${scmInfo}"
//         echo "${commit}"
//     }

    stage ("Condition"){
    commitMessage = bat(returnStdout: true, script: 'git log -1 --oneline').trim()
    echo "______________________"
    echo "${commitMessage}"

    if(commitMessage.toLowerCase().endsWith("dev")){
        echo "PUFFFF"
     }
    else{
        echo "fuckoff"}
    }
}
