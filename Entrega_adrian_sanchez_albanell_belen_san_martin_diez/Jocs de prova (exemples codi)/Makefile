SRCS := $(wildcard *.vl)

.PHONY: all clean distclean

all:
	@$(foreach vl,$(SRCS),\
		echo Creating AST of $(vl);\
		../Vlcl/bin/Vlcl $(vl) -ast $(vl:.vl=.dot) -dot -noexec;\
		dot -Tpdf -o $(vl:.vl=.pdf) $(vl:.vl=.dot);\
	)

clean:
	rm *.dot
	rm *.pdf
	rm *.trace

distclean: clean