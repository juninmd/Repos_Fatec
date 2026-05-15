import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { ProductsProvider } from '../../providers/products/products';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  products: any = [];

  constructor(public navCtrl: NavController, private productsProvider: ProductsProvider) {
  }

  ionViewDidLoad() {
    this.productsProvider.get().subscribe((q) => this.products = q, (err) => alert(err))
  }

  like(product: any) {
    product.like = !product.like;
  }

  details(product: any) {
    this.navCtrl.push('DetailsProductPage', { product: product });
  }

  contato() {
    this.navCtrl.push('ContactPage');
  }

}
