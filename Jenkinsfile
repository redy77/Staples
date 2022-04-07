
    node {
        checkout scm
        commitMessage = bat(returnStdout:true, script:'git log -1 --oneline').trim
                branchName = "${GIT_BRANCH.split(" / ")[1]}"

                stage("Condition") {
            echo "______________________"
            echo "${commitMessage}"
            echo "______________________"
            echo "${branchName}"
            echo "______________________"
            if (commitMessage.toLowerCase().endsWith(" dev")) {
                echo "PUFFFF"
            } else {
                echo "fuckoff"
            }
        }
    }
