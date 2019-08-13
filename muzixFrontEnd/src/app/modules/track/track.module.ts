import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { PlaylistComponent } from './components/playlist/playlist.component';
import { CardComponent } from './components/card/card.component';
import { MaterialModule } from 'src/app/material';
import { HttpClientModule } from '@angular/common/http';
import { MDBBootstrapModule } from 'angular-bootstrap-md';


@NgModule({
  declarations: [HeaderComponent, FooterComponent, HomeComponent, PlaylistComponent, CardComponent],
  imports: [
    CommonModule,
    MaterialModule,
    HttpClientModule,
    MDBBootstrapModule
  ],
  exports: [HeaderComponent]
})
export class TrackModule { }