import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  imports: [],
  templateUrl: './data-binding.html',
  styleUrl: './data-binding.css',
})
export class DataBinding {
//---------Propriedades------------------
  nome:string = "Ulisses";

  img:string = "https://maniamoto.com.br/wp-content/uploads/2025/07/tracado-goiania.jpeg";
  larg:number = 500;

  cor_texto:string = "red";

  disab:boolean = true;
//------------Eventos------------------
  cont:number = 0;
  disab02:boolean = false;
  disab03:boolean = true;

  //função
  contar() {
    this.cont++
    if (this.cont >= 10){
      this.disab02 = true
      this.disab03 = false
    } 
  }
  reset() {
    this.cont = 0;
    this.disab02 = false
    this.disab03 = true
  }

  cor_fundo:string = "blue"

  muda_cor(nova_cor:string) {
    this.cor_fundo = nova_cor;
  } 


}