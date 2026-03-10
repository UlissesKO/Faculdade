import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-data-binding',
  imports: [FormsModule],
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

  cor_hover:string = "blue"

  muda_cor(nova_cor:string) {
    this.cor_hover = nova_cor;
  } 

  cor_texto02:string = "yellow"

  valorInicial:number = 0;
  taxaJuros:number = 0/10;

    //Se deve colocar o tipo da função caso retorne algum valor
  totalEstimado():number {
    return this.valorInicial + (this.valorInicial * this.taxaJuros)
  }
}