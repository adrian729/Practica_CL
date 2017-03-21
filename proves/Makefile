all:
	Asl prova.vl -ast prova.dot -dot -noexec
	dot -Tpdf -o prova.pdf prova.dot

exec:
	Asl prova.vl -trace prova.trace

clean:
	rm prova.dot prova.pdf prova.trace