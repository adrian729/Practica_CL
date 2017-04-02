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
		echo Execute $(vl);\
		Vlcl $(vl) -trace $(vl:.vl=.trace);\
	)

clean:
	rm *.dot
	rm *.pdf
	rm *.trace

distclean: clean