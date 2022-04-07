
    node {
        scmInfo = checkout scm
        commitMessage = bat(returnStdout:true, script:'git log -1 --oneline').trim
//                 branchName = bat(script:'git name-rev --name-only HEAD', returnStdout: true)

                stage("Condition") {
            echo "______________________"
            echo "${commitMessage}"
            echo "______________________"
//             echo "${branchName}"
            echo "______________________"
            if (commitMessage.toLowerCase().endsWith(" dev")) {
                echo "PUFFFF"
            } else {
                echo "fuckoff"
            }
        }
    }
