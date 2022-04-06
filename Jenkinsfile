
node {
commit = bat(returnStdout: true, script: 'git log -1 --oneline').trim()
commit.toLowerCase()
    stage ("Checkout") {

        scmInfo = checkout scm

        echo "scm : ${scmInfo}"
        echo "${commit}"



    }

    stage ("Condition"){
    if(commit.toLowerCase().contains("dev")){
                       echo "PUFFFF"
                    }
    else{
    echo "fuckoff"}
    }
}
