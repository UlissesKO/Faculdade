import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  imports: [],
  templateUrl: './data-binding.html',
  styleUrl: './data-binding.css',
})
export class DataBinding {
  nome:string = "Ulisses";

  img:string = "https://maniamoto.com.br/wp-content/uploads/2025/07/tracado-goiania.jpeg";
  larg:number = 500;

  cor_texto:string = "red";

  disab:boolean = true;
}
