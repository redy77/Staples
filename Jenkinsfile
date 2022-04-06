node {
    stage ("Checkout") {

        scmInfo = checkout scm

        /*...*/
        echo "scm : ${scmInfo}"
        echo "${scmInfo.GIT_COMMIT}"
        echo "${entry.author} ${entry.commitId}:\n${formatter.format(new Date(entry.timestamp))}: *${entry.msg}*\n"


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