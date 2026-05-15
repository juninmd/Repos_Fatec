import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { DetailsProductPage } from './details-product';

@NgModule({
  declarations: [
    DetailsProductPage,
  ],
  imports: [
    IonicPageModule.forChild(DetailsProductPage),
  ],
})
export class DetailsProductPageModule {}
