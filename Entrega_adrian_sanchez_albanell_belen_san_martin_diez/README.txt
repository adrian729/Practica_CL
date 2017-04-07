
Documentacio:

Els documents "A_visualizer_of_logic_circuits.docx" i "A visualizer of logic circuits.pdf" son
el mateix document (amb diferents extensions per si .docx dona problemes).
Expliquen breument de que tracta el projecte i la seva arquitectura. Tambe mes extensivament que
inclou i com ho fa el llenguatge que tractarem (una part de Verilog) a nivell sintactic i lexic.

Vlcl (visualizer of logic circuits language): 

	-> fet a partir del codi de Asl, nomes esta implementada la part de la gramatica (la resta 
	nomes s'ha modificat el necessari per a poder generar els AST).
	-> ja te preparat el makefile per al nou llenguatge (hauria de funcionar fent make i make clean per netejar els fitxers).

Jocs de prova:

	-> exemples de codi (per veure com generem els AST).
	-> ja te preparat un makefile per a generar automaticament els .dot i .pdf amb els AST dels
	jocs de prova (funciona tal i com estan organitzats els directoris en l'entrega, si es mou
	la direccio de Vlcl s'haura de modificar). Nomes cal fer make (o make clean per netejar els
	fitxers generats).


**Els makefiles estan fets per funcionar amb bash (el del joc de proves, l'altre esta generat a
partir del que ens doneu per ASL). No hauria, pero si dona algun problema pot ser degut a aixo.