node {
    stage ("Checkout") {

        scmInfo = checkout scm

        /*...*/
        echo "scm : ${scmInfo}"
        echo "${scmInfo.GIT_COMMIT}"
        echo "${scmInfo.GIT_MESSAGE}"

            echo ":::::::::::GIT_SHORT_COMMIT::::::::::::::::::::::::"

            GIT_SHORT_COMMIT = sh(returnStdout: true, script: "git log -n 1 --pretty=format:'%h'").trim()
            //echo in jenkins console
            echo GIT_SHORT_COMMIT
            //wanted to send these info to build artifacts, append to any file
            sh("echo ${GIT_SHORT_COMMIT} > GIT_SHORT_COMMIT")

            //Similar proceed for other git info's
            echo ":::::::::::GIT_COMMITTER_EMAIL::::::::::::::::::::::::"

            GIT_COMMITTER_EMAIL = sh(returnStdout: true, script: "git show -s --pretty=%ae").trim()
            sh("echo ${GIT_COMMITTER_EMAIL} > GIT_COMMITTER_EMAIL-${GIT_COMMITTER_EMAIL}")



            echo ":::::::::::GIT_COMMITTER_NAME::::::::::::::::::::::::"

            GIT_COMMITTER_NAME = sh(returnStdout: true, script: "git show -s --pretty=%an").trim()
            sh("echo ${GIT_COMMITTER_NAME} > GIT_COMMITTER_NAME-${GIT_COMMITTER_NAME}")


    }
}
// pipeline{
//     agent any
//     stages{
//         stage('Git clone'){
//             steps{
//                 git 'https://github.com/redy77/Staples.git'
//             }
//
//         }
//
//         stage('Maven test'){
//             steps{
//                 bat 'mvn test'
//             }
//         }
//
//                 stage('Maven build'){
//             steps{
//                 bat 'mvn package'
//             }
//         }
//
//         stage('Git deploy'){
//             steps{
//                 echo " Deploy"
//             }
//         }
//
//     }
// }