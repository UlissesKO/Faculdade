import { Component } from '@angular/core';             //VERSÃO ANTIGA
import { CommonModule } from '@angular/common'; //Import para utilizar o If-Else

@Component({
  selector: 'app-exemplo-if',
  imports: [CommonModule],
  templateUrl: './exemplo-if.html',
  styleUrl: './exemplo-if.css',
})
export class ExemploIf {
  titulo:string = "Exemplo de execução IF"
  mostra:boolean = false //Variavel de parametro para o If-Else (VERSÃO ANTIGA)
}
