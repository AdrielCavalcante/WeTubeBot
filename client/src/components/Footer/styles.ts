import styled from 'styled-components';

export const Rodape = styled.div`
  display: flex;
  align-items: center;
  justify-content: center;

  padding: 2em;
  background-color: #ce2029;
`;

export const Copy = styled.span`
  font-size: 16pt;
  font-weight: bold;
  color: #ffdf00;

  @media(max-width: 426px){
    &{
      font-size: 14pt;
    }
  }
`;