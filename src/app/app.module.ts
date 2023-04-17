import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InsertdataComponent } from './insertdata/insertdata.component';
import { UpdatedataComponent } from './updatedata/updatedata.component';
import { DeletedataComponent } from './deletedata/deletedata.component';
import { FormsModule } from '@angular/forms';
import { ViewdataComponent } from './viewdata/viewdata.component';


@NgModule({
  declarations: [
    AppComponent,
    InsertdataComponent,
    UpdatedataComponent,
    DeletedataComponent,
    ViewdataComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
