package io.jenkins.plugins.designlibrary.Links;

import lib.JenkinsTagLib

def st=namespace("jelly:stapler")

t=namespace(JenkinsTagLib.class)

def example(html) {
    tr {
        td {
            text(html)
        }
        td {
            raw(html)
        }
    }
}

namespace("/lib/samples").sample(title:_("title")) {
    raw(_("blurb"))

    h2(_("define.title"))
    raw(_("blurb.define"))

    h2(_("breadcrumb.title"))
    raw(_("blurb.breadcrumb"))


    h2(_("hyperlink.title"))
    raw(_("blurb.modelLink"))
    table(border:1) {
        example "<a href='.' class='model-link'>self</a>"
        example "<a href='..' class='model-link'>up</a>"
    }

    raw(_("blurb.modelLink.inside"))
    table(border:1) {
        example "<a href='.' class='model-link inside'>self</a>"
        example "<a href='..' class='model-link inside'>up</a>"
    }

    raw(_("blurb.tltr"))
    table(border:1) {
        example "<a href='.' class='model-link tl-tr'>self</a>"
        example "<a href='..' class='model-link tl-tr'>up</a>"
    }
}
