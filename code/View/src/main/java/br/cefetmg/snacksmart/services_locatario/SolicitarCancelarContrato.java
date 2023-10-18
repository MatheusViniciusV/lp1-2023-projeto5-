/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package br.cefetmg.snacksmart.services_locatario;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import br.cefetmg.snacksmart.dto.ContratoDTO;
import java.time.LocalDate;

/**
 *
 * @author eloym
 */
@WebServlet(name="SolicitarCancelarContrato", urlPatterns={"/SolicitarCancelarContrato"})
public class SolicitarCancelarContrato extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            LocalDate dataInicio = LocalDate.of(2023, 7, 1);
            LocalDate dataExpiracao = dataInicio.plusYears(1);  // Um ano após o início
            LocalDate dataPagamento = LocalDate.of(2023, 7, 1);
            String observacoes = "Observações aleatórias";  // Substitua por observações aleatórias

            ContratoDTO contrato = new ContratoDTO(dataInicio, dataExpiracao, dataPagamento, observacoes);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolicitarCancelarContrato</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SolicitarCancelarContrato at " + request.getContextPath () + "</h1>");
            out.println("<p>" + contrato.toString() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String stringRecebida = request.getParameter("minhaString");

        // Verifique se a string é "oi"
        if ("oi".equals(stringRecebida)) {
            // Se for "oi", retorne "ola"
            String resposta = "ola";

            // Defina o tipo de conteúdo da resposta como texto
            response.setContentType("text/plain");

            // Escreva a resposta para o cliente
            PrintWriter out = response.getWriter();
            out.print(resposta);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
