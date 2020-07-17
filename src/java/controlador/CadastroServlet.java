package controlador;

import entidade.Cadastro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.CadastroDAO;

public class CadastroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();



        String auxPrimeroNome = request.getParameter("PrimeiroNome");
        String auxSegundoNome = request.getParameter("SegundoNome");
        String auxEndereco = request.getParameter("Endereco");
        String auxEndNum = request.getParameter("EndNum");
        String auxCidade = request.getParameter("Cidade");
        String auxUF = request.getParameter("UF");
        String auxEmail = request.getParameter("Email");
        
        Cadastro cadastro = new Cadastro();
        cadastro.setPrimeiroNome(auxPrimeroNome);
        cadastro.setSegundoNome(auxSegundoNome);
        cadastro.setEndereco(auxEndereco);
        cadastro.setEndNum(auxEndNum);
        cadastro.setCidade(auxCidade);
        cadastro.setUf(auxUF);
        cadastro.setEmail(auxEmail);

        CadastroDAO cadastroDAO = new CadastroDAO();
        
        if (cadastroDAO.cadastro(cadastro)){
            RequestDispatcher rd = request.getRequestDispatcher("listaCadastro.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect("cadastro.html");
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
