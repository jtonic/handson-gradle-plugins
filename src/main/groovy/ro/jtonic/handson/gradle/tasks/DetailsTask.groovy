package ro.jtonic.handson.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import org.gradle.testfixtures.ProjectBuilder

/**
 * Created by Antonel Ernest Pazargic on 23/12/2017.
 * @author Antonel Ernest Pazargic
 */
class JavaDetailsTask extends DefaultTask {

    @Input @Optional
    String prefix = "Details"

    @TaskAction
    def run() {
        def project = ProjectBuilder.builder().build()
        project.logger.quiet "$prefix: ${System.getProperty('java.version')}"
    }
}
