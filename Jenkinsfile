node {
    stage ("Checkout") {

        scmInfo = checkout scm

        /*...*/
        echo "scm : ${scmInfo}"
        echo "${scmInfo.GIT_COMMIT}"
        echo "${scmInfo.GIT_MESSAGE} # print commit"


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