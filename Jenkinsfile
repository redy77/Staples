
node {
    checkout scm
    commitMessage = bat(returnStdout: true, script: 'git log -1 --oneline').trim()

    stage ("Condition"){
    echo "______________________"
    echo "${commitMessage}"

    if(commitMessage.toLowerCase().endsWith("dev")){
        echo "PUFFFF"
     }
    else{
        echo "fuckoff"}
    }
}
