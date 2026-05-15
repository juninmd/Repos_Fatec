import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class ProductsProvider {

  constructor(public http: HttpClient) {
  }

  get() {
    return this.http.get('http://localhost:8050/products/')
  }

  put(body: any) {
    return this.http.put('http://localhost:8050/message/', body)
  }

}
