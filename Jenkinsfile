// @NonCPS
// def sendChangeLogs() {
//     def commitMessages = ""
// //     def changeLogSets = currentBuild.changeSets
// //     for (int i = 0; i < changeLogSets.size(); i++) {
// //         def entries = changeLogSets[i].items
// //         for (int j = 0; j < entries.length; j++) {
// //             def entry = entries[j]
// //
// //         }
//         commitMessages = commitMessages + "${entry.msg}*"
// //     }
// }

node {
    stage ("Checkout") {

        scmInfo = checkout scm
//         script {
//                     sendChangeLogs()
//                 }
        echo "scm : ${scmInfo}"
        echo "${entry.msg}"
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