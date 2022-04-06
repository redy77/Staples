
node {
commit = sh(returnStdout: true, script: 'git log -1 --oneline').trim()
    stage ("Checkout") {

        scmInfo = checkout scm

        echo "scm : ${scmInfo}"
//         echo "scm : {Commit message}"
    }
}
