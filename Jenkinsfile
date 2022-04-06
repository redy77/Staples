
node {
commit = bat(returnStdout: true, script: 'git log -1 --oneline').trim()
commit.toLowerCase(Locale.ROOT)
    stage ("Checkout") {

        scmInfo = checkout scm

        echo "scm : ${scmInfo}"
        echo "${commit}"



    }

    stage ("Условие"){
    if(commit.contains("dev")){
                        echo "PUFFFF"
                    }
    }
}
