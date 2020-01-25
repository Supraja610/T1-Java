import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { FormactionComponent } from './formaction/formaction.component';
import { AsideComponent } from './aside/aside.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    FormactionComponent,
    AsideComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
