package com.thedevelopers.happypets.Paginator;

import org.springframework.data.domain.Page;

public class PageRender<T> {
    private String url;
    private Page<T> page;
    private int totalPaginas;
    private int numElementosPorPagina;
    private int paginaActual;

    public PageRender(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        numElementosPorPagina = page.getSize();
        paginaActual = page.getNumber();

        int desde, hasta;
        if (totalPaginas <= numElementosPorPagina) {
            desde = 1;
            hasta = totalPaginas;
        } else {
            if (paginaActual <= numElementosPorPagina / 2) {

            } else if (paginaActual >= totalPaginas - numElementosPorPagina / 2) {
                desde = totalPaginas - numElementosPorPagina + 1;
                hasta = numElementosPorPagina;

            } else {
                desde = paginaActual - numElementosPorPagina / 2;
                hasta = numElementosPorPagina;
            }
        }
    }
}
