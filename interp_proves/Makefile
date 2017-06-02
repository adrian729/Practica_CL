SRCS := $(wildcard *.vl)

.PHONY: all clean distclean

all:
	@$(foreach vl,$(SRCS),\
		echo Creating AST of $(vl);\
		Vlcl $(vl) -ast $(vl:.vl=.dot) -dot -noexec;\
		dot -Tpdf -o $(vl:.vl=.pdf) $(vl:.vl=.dot);\
	)

exec:
	@$(foreach vl,$(SRCS),\
		echo % Execute $(vl);\
		Vlcl $(vl) > $(vl:.vl=.tex);\
		pdflatex $(vl:.vl=.tex);\
		rm $(vl:.vl=.aux);\
		rm $(vl:.vl=.log);\
	)
	rm graph.dot

clean:
	rm *.dot
	rm *.pdf
	rm *.trace

distclean: clean