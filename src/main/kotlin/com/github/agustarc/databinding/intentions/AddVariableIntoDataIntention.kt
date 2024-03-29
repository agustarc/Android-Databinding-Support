/*
 * Copyright 2019 Leopold Baik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.agustarc.databinding.intentions

import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile


/**
 * @author Leopold
 * https://github.com/AgustaRC
 * https://medium.com/@joongwon
 */
class AddVariableIntoDataIntention : AddTagIntoDataIntention() {

    override fun startInWriteAction(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFamilyName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getText(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}