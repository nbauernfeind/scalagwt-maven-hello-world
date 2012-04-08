package com.nefariouszhen.helloworld.client

import com.google.gwt.core.client.EntryPoint
import com.google.gwt.user.client.ui.Label
import com.google.gwt.user.client.ui.RootPanel

class HelloWorld extends EntryPoint {
  def onModuleLoad() {
    RootPanel.get().add(new Label("Hello World"))
  }
}
