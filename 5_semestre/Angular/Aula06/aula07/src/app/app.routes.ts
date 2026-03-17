import { Routes } from '@angular/router';

import { Home } from './componentes/home/home';
import { Pagina1 } from './componentes/pagina1/pagina1';
import { Pagina2 } from './componentes/pagina2/pagina2';
import { Sobre } from './componentes/sobre/sobre';
import { Notfound } from './componentes/notfound/notfound';

//Aqui vai ficar as páginas do site. (Rotas)
export const routes: Routes = [
    {path:'', component:Home}, //Quando o path é string vazio, é a página que abre inicialmente
    {path:'pag1', component:Pagina1},
    {path:'pag2', component:Pagina2},
    {path:'sobre', component:Sobre},
    {path:'error', component:Notfound},
    {path:'**', redirectTo:'error', pathMatch:'full'} //Redirecionamento para caso a pagina não exista
];
