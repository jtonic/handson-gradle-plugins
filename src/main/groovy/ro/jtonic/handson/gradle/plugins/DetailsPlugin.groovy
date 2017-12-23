package ro.jtonic.handson.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Antonel Ernest Pazargic on 22/12/2017.
 * @author Antonel Ernest Pazargic
 */
class DetailsPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        def extension = project.extensions.create('details', DetailsPluginExtension)

        project.tasks.create('details') {
            group = 'tony'
            doLast {
                def tasks = project.tasks.toSet().join(', ')
                project.logger.quiet("$extension.prefix: '$tasks'")
            }
        }
    }
}

class DetailsPluginExtension {

    String prefix = 'All tasks'
}
